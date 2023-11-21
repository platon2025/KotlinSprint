package lesson_22

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData("newData")
}

class MainScreenViewModel() {

    private var screenState = MainScreenState("noData")
    private var isLoading = false
        set(value) {
            field = value
            if (value) screenState = screenState.copy(data = "loadingData")
        }

    fun loadData(data: String) {
        isLoading = true
        screenState = screenState.copy(data = data)
        isLoading = false
    }

    data class MainScreenState(val data: String, var isLoading: Boolean = false) {
        init {
            println("screenState = $data")
        }
    }

}
