package lesson22

fun main() {
    val viewModel = ViewModel(MainScreenState())
    viewModel.loadData()
}

class ViewModel(var mainScreenState: MainScreenState){
    fun loadData(){
        println(mainScreenState)
        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(data = "Data loading", isLoading = true)
        println(mainScreenState)
        Thread.sleep(1000)

        mainScreenState = mainScreenState.copy(data = "Data loaded", isLoading = false)
        println(mainScreenState)
        Thread.sleep(1000)
    }
}

data class MainScreenState(val data: String? = null, var isLoading: Boolean = false)