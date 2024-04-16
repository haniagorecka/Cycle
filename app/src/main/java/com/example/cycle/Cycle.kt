package com.example.cycle
/**
 * @author Hanna Górecka
 * Funkcja zwraca listę elementów ciągu collatza zaczynającego się od c0 przed tym jak wpadnie w cykl, przyjmuję, że cykl zaczyna się
 * od pierwszego elementu równego 4 włącznie, więc nie wypisuję już tego elementu
 * @param c0 pierwszy element ciągu
 * @return lista elementów ciągu przed wpadnięciem w cykl
 * @throws Exception jeśli pierwszy element ciągu jest niedodatni
 */

fun collatz(c0: Int): MutableList<Int>
{
    if(c0<=0) throw Exception ("Błędny pierwszy element ciągu")
    var list= mutableListOf<Int>()
    var c1: Int = c0

    while(c1!=4)
    {
        if(c1%2==0)
        {
            list.add(c1)
            c1=c1/2

        }
        else
        {
            list.add(c1)
            c1=3*c1+1
        }
    }
    return list

}

/**
 * Funkcja testująca funkcji collatz()
 */
fun test ()
{
    val list = mutableListOf<Int>(5, 16, 8)
    assert(collatz(5)==list, {"Test funkcji zakończony niepowodzeniem"})
    println("Test funkcji zakończony powodzeniem")
}

fun main()
{
    test()
}