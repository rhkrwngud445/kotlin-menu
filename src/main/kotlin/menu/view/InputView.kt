package menu.view

import camp.nextstep.edu.missionutils.Console
import menu.validator.CoachValidator

class InputView {
    fun inputCoachList() : String{
        return try{
            val input = Console.readLine()
            CoachValidator().checkInput(input)
            input
        } catch (e : IllegalArgumentException){
            print("[ERROR] 입력 값을 확인해주세요.")
            inputCoachList()
        }
    }
}