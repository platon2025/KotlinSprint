package lesson_22

data class MainScreenState(val data: String, var isLoading: Boolean = false) {
    init {
        println("state = $data")
    }
}

fun main() {
    var screenState = MainScreenState("noData")
    screenState = loadData(screenState, "dataLoading")
    screenState = loadData(screenState, "dataLoaded")
}

fun loadData(screenState: MainScreenState, data: String): MainScreenState = screenState.copy(data = data)