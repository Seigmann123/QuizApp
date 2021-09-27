package com.quizapp

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "There are 219 episodes of Friends",
            R.drawable.ic_friends,
            "True", "False",
             2
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "H&M stands for Hennes & Mauritz",
            R.drawable.ic_hm_logo,
            "True", "False",
             1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "In Harry Potter, Draco Malfoy has no siblings",
            R.drawable.ic_draco_malfoy,
            "True", "False",
            2
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "Harry Styles' middle name is Edward",
            R.drawable.ic_harry_styles,
            "True", "False",
              1
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Bananas are curved because they grow upwards towards the sun",
            R.drawable.ic_banana,
            "True", "False",
            1
        )

        questionsList.add(que5)

        return questionsList
    }
}