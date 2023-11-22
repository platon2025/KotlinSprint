package lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData("newData")
}

class MainScreenViewModel {

    private var screenState = MainScreenState("noData")

    fun loadData(data: String) {
        screenState = screenState.copy(isLoading = true)
        screenState = screenState.copy(data = data, isLoading = false)
    }

    data class MainScreenState(val data: String, var isLoading: Boolean = false) {
        init {
            println("screenState = $data, isLoading = $isLoading")
        }
    }

}
