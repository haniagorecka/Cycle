package com.example.cycle


fun collatz(c0: Int): MutableList<Int>
{
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

fun main()
{
    val list1 = collatz(5)
    val list2 = collatz(4)
    val list3 = collatz(89)

    println(list1)
    println(list2)
    println(list3)

}