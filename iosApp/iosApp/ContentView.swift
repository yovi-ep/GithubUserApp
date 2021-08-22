import SwiftUI
import core
import Combine

struct ContentView: View {
	let greet = Greeting().greeting()
    @ObservedObject var viewModel: MainViewModel = .init()

	var body: some View {
        Text("\(greet)\n\(viewModel.usersResponse)")
            .onAppear {
                viewModel.getUser()
            }
	}
}

class MainViewModel: ObservableObject {
    @Published var usersResponse: String = ""
    
    private let useCase: UserListUseCase = UserListUseCaseImpl(
        repository: UserListRepositoryImpl(dataSource: UserListRemoteSource())
    )
    
    func getUser() {
        useCase.getUserList(query: "a") { [weak self] response, error in
            if let err = error {
                print(err)
            } else {
                self?.usersResponse.append("\(String(describing: response))")
            }
        }
    }
}


struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
