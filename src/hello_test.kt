object hello_test {
    @JvmStatic
    fun main(args: Array<String>) {
        val str1 = "he he he"
        val str = str1.split(" ".toRegex()).dropLastWhile { it.isEmpty }.toTypedArray()
    }
}
