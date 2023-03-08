enum class Days {
    понедельник {
        override fun days() = "понедельник"
    },
    вторник {
        override fun days() = "вторник"
    },
    среда {
        override fun days() = "среда"
    },
    четверг {
        override fun days() = "четверг"
    },
    пятница {
        override fun days() = "пятница"
    },
    суббота {
        override fun days() = "суббота"
    },
    воскресенье {
        override fun days() = "воскресенье"
    };

    abstract fun days(): String
}