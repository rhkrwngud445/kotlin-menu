package menu.view

class OutputView {
    fun outputResult(weekMenu: List<List<String>>, coachList: List<String>, categoryList: List<String>) {
        println("메뉴 추천 결과입니다.")
        println("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]")
        println(makeOutputForm("카테고리",categoryList))
        for(coachIndex in coachList.indices){
            val foodList = mutableListOf<String>()
            for(dayIndex in 0..4){
                foodList.add(weekMenu[dayIndex][coachIndex])
            }
            println(makeOutputForm(coachList[coachIndex],foodList))
        }
        println("\n추천을 완료했습니다.\n")
    }

    private fun makeOutputForm(first : String, list : List<String>) : String {
        var result = "[ $first | "
        result+=list.joinToString(" | ")
        result+=" ]"
        return result
    }
}