package inheritance

/**
 * Created by Mohamed Hassan on 6/1/2017.
 * mhabulazm@gmail.com
 */
interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

class GenericRepo<T> : Repository<T> {
    override fun getAll(): List<T> {
        TODO("not implemented")
    }

    override fun getById(id: Int): T {
        TODO("not implemented")
    }
}

fun main(args: Array<String>) {
    val c = GenericRepo<Customer>()
    val list = c.getAll()
}

interface Repo {
    fun <T> getById(id: Int): T
    fun <T> getAll(): List<T>
    fun <RoomEntity> getAllRooms(): List<RoomEntity>

}