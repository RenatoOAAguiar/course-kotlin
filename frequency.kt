package oo

import java.io.File

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()
    File("ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
        //if(ipToCount.contains(it)) {
        //    val previous = ipToCount.get(it)!!
        //    ipToCount.put(it, previous + 1)
        //} else {
        //    ipToCount.put(it,1)
        //}

        var (maxIp, maxCount) = ipToCount.entries.maxBy {it.value}!!

        //var maxIp = ipToCount.keys.first()
        //var maxCount = 0
        //for((ip, count) in ipToCount.entries) {
        //    if(count > maxCount) {
        //        maxCount = count
        //        maxIp = ip
        //    }
        //}
    }

}