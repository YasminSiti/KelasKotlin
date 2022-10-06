fun helloPolban() {
    println("Hello Polban")
}

fun helloSiswa(nama: String) {
    println("hello apa kabar $nama")
}

fun nilaiAkhir(uts:Int, uas:Int): Int {
    return (uts + uas) / 2
}


fun main () {
    val nama = "Ucup"

    helloPolban()
    helloSiswa(nama)

    val nilai = nilaiAkhir(8, 70)

    println("Nilai akhir $nama adalah: $nilai")
}