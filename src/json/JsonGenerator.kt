package json

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.File
import java.util.*

/**
 * Created by Mohamed Hassan on 6/15/2017.
 * mhabulazm@gmail.com
 */
data class Item(
        @JsonProperty("id")
        var id: String,
        @JsonProperty("image")
        var image: String,
        @JsonProperty("title")
        var title: String,
        @JsonProperty("description")
        var description: String,
        @JsonProperty("shouldDisplayText")
        var shouldDisplayText: Boolean,
        @JsonProperty("index")
        var index: Int
)

fun getRandomLimitedIndex(index: Int) = Random().nextInt(index)

fun getRandomLimitedBoolean(index: Int) = getRandomLimitedIndex(index) % 2 == 0

val images = arrayListOf(
        "https://lh3.googleusercontent.com/--L0Km39l5J8/URquXHGcdNI/AAAAAAAAAbs/3ZrSJNrSomQ/s1024/Antelope%252520Butte.jpg",
        "https://lh6.googleusercontent.com/-8HO-4vIFnlw/URquZnsFgtI/AAAAAAAAAbs/WT8jViTF7vw/s1024/Antelope%252520Hallway.jpg",
        "https://lh4.googleusercontent.com/-WIuWgVcU3Qw/URqubRVcj4I/AAAAAAAAAbs/YvbwgGjwdIQ/s1024/Antelope%252520Walls.jpg",
        "https://lh3.googleusercontent.com/-s-AFpvgSeew/URquc6dF-JI/AAAAAAAAAbs/Mt3xNGRUd68/s1024/Backlit%252520Cloud.jpg",
        "https://lh5.googleusercontent.com/-bvmif9a9YOQ/URquea3heHI/AAAAAAAAAbs/rcr6wyeQtAo/s1024/Bee%252520and%252520Flower.jpg",
        "https://lh6.googleusercontent.com/-4CN4X4t0M1k/URqufPozWzI/AAAAAAAAAbs/8wK41lg1KPs/s1024/Caterpillar.jpg",
        "https://lh3.googleusercontent.com/-rrFnVC8xQEg/URqufdrLBaI/AAAAAAAAAbs/s69WYy_fl1E/s1024/Chess.jpg",
        "https://lh5.googleusercontent.com/-WVpRptWH8Yw/URqugh-QmDI/AAAAAAAAAbs/E-MgBgtlUWU/s1024/Chihuly.jpg",
        "https://lh5.googleusercontent.com/-0BDXkYmckbo/URquhKFW84I/AAAAAAAAAbs/ogQtHCTk2JQ/s1024/Closed%252520Door.jpg",
        "https://lh3.googleusercontent.com/-ZAs4dNZtALc/URquikvOCWI/AAAAAAAAAbs/DXz4h3dll1Y/s1024/Colors%252520of%252520Autumn.jpg",
        "https://lh4.googleusercontent.com/-GztnWEIiMz8/URqukVCU7bI/AAAAAAAAAbs/jo2Hjv6MZ6M/s1024/Countryside.jpg",
        "https://lh6.googleusercontent.com/-ijQJ8W68tEE/URqulGkvFEI/AAAAAAAAAbs/zPXvIwi_rFw/s1024/Delicate%252520Arch.jpg",
        "https://lh5.googleusercontent.com/-Oh8mMy2ieng/URqullDwehI/AAAAAAAAAbs/TbdeEfsaIZY/s1024/Despair.jpg",
        "https://lh5.googleusercontent.com/-gl0y4UiAOlk/URqumC_KjBI/AAAAAAAAAbs/PM1eT7dn4oo/s1024/Eagle%252520Fall%252520Sunrise.jpg",
        "https://lh3.googleusercontent.com/-hYYHd2_vXPQ/URqumtJa9eI/AAAAAAAAAbs/wAalXVkbSh0/s1024/Electric%252520Storm.jpg",
        "https://lh5.googleusercontent.com/-PyY_yiyjPTo/URqunUOhHFI/AAAAAAAAAbs/azZoULNuJXc/s1024/False%252520Kiva.jpg",
        "https://lh6.googleusercontent.com/-PYvLVdvXywk/URqunwd8hfI/AAAAAAAAAbs/qiMwgkFvf6I/s1024/Fitzgerald%252520Streaks.jpg",
        "https://lh4.googleusercontent.com/-KIR_UobIIqY/URquoCZ9SlI/AAAAAAAAAbs/Y4d4q8sXu4c/s1024/Foggy%252520Sunset.jpg",
        "https://lh6.googleusercontent.com/-9lzOk_OWZH0/URquoo4xYoI/AAAAAAAAAbs/AwgzHtNVCwU/s1024/Frantic.jpg",
        "https://lh6.googleusercontent.com/-95sb5ag7ABc/URqupl95RDI/AAAAAAAAAbs/g73R20iVTRA/s1024/Golden%252520Gate%252520Fog.jpg",
        "https://lh3.googleusercontent.com/-JB9v6rtgHhk/URqup21F-zI/AAAAAAAAAbs/64Fb8qMZWXk/s1024/Golden%252520Grass.jpg",
        "https://lh4.googleusercontent.com/-EIBGfnuLtII/URquqVHwaRI/AAAAAAAAAbs/FA4McV2u8VE/s1024/Grand%252520Teton.jpg",
        "https://lh4.googleusercontent.com/-WoMxZvmN9nY/URquq1v2AoI/AAAAAAAAAbs/grj5uMhL6NA/s1024/Grass%252520Closeup.jpg",
        "https://lh3.googleusercontent.com/-6hZiEHXx64Q/URqurxvNdqI/AAAAAAAAAbs/kWMXM3o5OVI/s1024/Green%252520Grass.jpg",
        "https://lh5.googleusercontent.com/-6LVb9OXtQ60/URquteBFuKI/AAAAAAAAAbs/4F4kRgecwFs/s1024/Hanging%252520Leaf.jpg",
        "https://lh4.googleusercontent.com/-zAvf__52ONk/URqutT_IuxI/AAAAAAAAAbs/D_bcuc0thoU/s1024/Highway%2525201.jpg",
        "https://lh4.googleusercontent.com/-JhFi4fb_Pqw/URquuX-QXbI/AAAAAAAAAbs/IXpYUxuweYM/s1024/Horseshoe%252520Bend.jpg",
        "https://lh5.googleusercontent.com/-UGgssvFRJ7g/URquueyJzGI/AAAAAAAAAbs/yYIBlLT0toM/s1024/Into%252520the%252520Blue.jpg",
        "https://lh3.googleusercontent.com/-CH7KoupI7uI/URquu0FF__I/AAAAAAAAAbs/R7GDmI7v_G0/s1024/Jelly%252520Fish%2525202.jpg",
        "https://lh4.googleusercontent.com/-pwuuw6yhg8U/URquvPxR3FI/AAAAAAAAAbs/VNGk6f-tsGE/s1024/Jelly%252520Fish%2525203.jpg")

val phrases = arrayListOf(
        "Mens de barbatus navis, acquirere secula!",
        "Suffering is not synthetic in upstairs, the afterworld, or paradise, but everywhere.",
        "Popcorn can be enameled with delicious caviar, also try tossing the pilaf with champaign.",
        "The undead tuna heavily leads the pants.",
        "Engage, vital hypnosis!",
        "Mens de barbatus navis, acquirere secula!",
        "Suffering is not synthetic in upstairs, the afterworld, or paradise, but everywhere.",
        "Popcorn can be enameled with delicious caviar, also try tossing the pilaf with champaign.",
        "The undead tuna heavily leads the pants.",
        "Engage, vital hypnosis!",
        "Mens de barbatus navis, acquirere secula!",
        "Suffering is not synthetic in upstairs, the afterworld, or paradise, but everywhere.",
        "Popcorn can be enameled with delicious caviar, also try tossing the pilaf with champaign.",
        "The undead tuna heavily leads the pants.",
        "Engage, vital hypnosis!"
)

fun generateString(): String {
    return UUID.randomUUID().toString()
}

fun generateParagraph(): String {
    val random: Random = Random()
    random.nextInt()
    val bound: Int = phrases.size
    return phrases[random.nextInt(bound)] + phrases[random.nextInt(bound)] + phrases[random.nextInt(bound)]
}

fun main(args: Array<String>) {
//      string : id , index, title, description, type
    var items = listOf<Item>()
    var item: Item
    val imageIndex = getRandomLimitedIndex(images.size)
    val phraseIndex = getRandomLimitedIndex(phrases.size)
    for (i in 1..800) {
        val type = getRandomLimitedBoolean(i)
        item = Item(image = images[imageIndex], title = phrases[phraseIndex],
                description = generateParagraph(), id = generateString(),
                shouldDisplayText = type, index = (i + 120))
        items += item
    }
    writeJsonObjectsToFile(items)
}

fun writeJsonObjectsToFile(items: List<Item>) {
    val mapper: ObjectMapper = ObjectMapper()
    mapper.writeValue(File("output.json"), items)
}