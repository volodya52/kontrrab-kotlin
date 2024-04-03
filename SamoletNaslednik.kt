import kotlinx.coroutines.delay

class SamoletNaslednik():SamoletAbstract(planename ="",punktotprav = "",punktnazn = "",dataotprav = "",timeotprav = "",timeinway = "") {

    override fun Input() {
        println("Сколько раз запрашивать?")
        var n= readLine()!!.toInt()
        if (n<=0){
            println("Вы ввели неверное значение - ${n},установлено значение по умолчанию (1)")
                println("Название самолета")
                planename = readLine()!!.toString()
                if (planename == "Boeing 737" || planename == "Boeing 747" || planename == "Airbus A320"||planename == "boeing 737" || planename == "boeing 747" || planename == "airbus a320")
                {
                    println("Пункт отправления")
                    punktotprav = readLine()!!.toString()
                    println("Пункт назначения")
                    punktnazn = readLine()!!.toString()
                    println("Дата отправления")
                    dataotprav = readLine()!!.toString()
                    println("Время отправления")
                    timeotprav = readLine()!!.toString()
                    println("Время в пути")
                    timeinway = readLine()!!.toString()

                } else
                {
                    println("Вы неверно указали название самолета")
                }
        }else
        {
            for (i in 1..n){
                println("Название самолета")
                planename = readLine()!!.toString()
                if (planename == "Boeing 737" || planename == "Boeing 747" || planename == "Airbus A320"||planename == "boeing 737" || planename == "boeing 747" || planename == "airbus a320") {
                    println("Пункт отправления")
                    punktotprav = readLine()!!.toString()
                    println("Пункт назначения")
                    punktnazn = readLine()!!.toString()
                    println("Дата отправления")
                    dataotprav = readLine()!!.toString()
                    println("Время отправления")
                    timeotprav = readLine()!!.toString()
                    println("Время в пути")
                    timeinway = readLine()!!.toString()

                } else {
                    println("Вы неверно указали название самолета")
                }
            }
        }
    }

    override fun Output() {
        println("Название самолета - ${planename}")
        println("Пункт отправления - ${punktotprav}")
        println("Пункт назначения - ${punktnazn}")
        println("Дата отправления - ${dataotprav}")
        println("Время отправления- ${timeotprav}")
        println("Время в пути - ${timeinway}")
    }
    fun PlaneInfo() {
        println("----------Информация о самолете----------")
        println("Название самолета ${planename}")
        if (planename == "Boeing 737"||planename=="boeing 737") {
            println("Максимальная скорость самолета ${planename} = 850 км/ч")
            println("Вместимость - 189 мест")
            println("Наличие мест бизнес-класса - есть")
        } else if (planename == "Boeing 747"||planename=="boeing 747") {
            println("Максимальная скорость самолета ${planename} = 920 км/ч")
            println("Вместимость - 608 мест")
            println("Наличие мест бизнес-класса - есть")
        } else if (planename == "Airbus A320"||planename=="airbus a320") {
            println("Максимальная скорость самолета ${planename} = 871 км/ч")
            println("Вместимость - 180 мест")
            println("Наличие мест бизнес-класса - есть")
        }
    }
}
