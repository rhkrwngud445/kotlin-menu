package menu.domain

import camp.nextstep.edu.missionutils.Randoms

class Category {
    private val categories = listOf("일식","한식","중식","아시안","양식")
    private var categoryCount = mutableListOf(0,0,0,0,0)

    fun pickCategory() : String{
        val randomNumber = Randoms.pickNumberInRange(1, 5)
        if(categoryCount[randomNumber-1]>=2){
            return pickCategory()
        }
        categoryCount[randomNumber-1]++
        return categories[randomNumber-1]
    }
}