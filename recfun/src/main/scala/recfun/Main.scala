package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r ==0) {
      1
    }
    else {
       r * pascal(c-1,r-1)/c
    }

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def count(acc: Int, bcc: Int): Boolean = {
      if (acc < 0){
        false
      }
      else if (bcc == chars.length){
        acc == 0
      }
      else {
        val sum =
          if (chars(bcc) == '(') acc + 1
          else if (chars(bcc) == ')') acc - 1
          else acc
        count(sum, bcc + 1)
      }
    }

    count(0, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
   if (money == 0) 1
   else if (money<0) 0
   else if (coins.length == 0) 0
    else {
      countChange(money - coins(0), coins) + countChange(money, coins.drop(1))
    }

  }








  }


