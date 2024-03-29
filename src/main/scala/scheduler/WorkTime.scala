package scheduler

import util.DoW

/*
* Define the several types of work
*/
trait WorkTime

// Day work has end time. For example, Wednesday work is ended at 11:30
case class Day(year: Int, month: Int, date: Int, day: DoW) extends WorkTime {
  override def toString: String = {
    year + "년 " + month + "월 " + date + "일 " + day.toString + "요일" + " 주간"
  }
}
case class Night(year: Int, month: Int, date: Int, day: DoW) extends WorkTime {
  override def toString: String = {
    year + "년 " + month + "월 " + date + "일 " + day.toString + "요일" + " 야간"
  }
}
// Off has two type, night work off and just off
case class Off(year: Int, month: Int, date: Int, day: DoW) extends WorkTime { // Both night off and just off
  override def toString: String = {
    year + "년 " + month + "월 " + date + "일 " + day.toString + "요일" + " 비번"
  }
}
case class Holiday(year: Int, month: Int, date: Int, day: DoW) extends WorkTime {
  override def toString: String = {
    year + "년 " + month + "월 " + date + "일 " + day.toString + "요일" + " 휴가"
  }
}
