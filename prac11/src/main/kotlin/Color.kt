enum class Color {

    розовый {
        override fun color() = "255, 192, 203"

    },

    серый {
        override fun color() = "128, 128, 128"
    },

    черный {
        override fun color() = "0, 0, 0"
    },

    белый {
        override fun color() = "255, 255, 255"
    };

    abstract fun color(): String
}