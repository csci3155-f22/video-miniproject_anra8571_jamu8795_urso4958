 import  jsy.lab3.Parser 
// Imports the parse function from jsy.lab1.Parser
import jsy.lab3.Parser.parse

// Imports the ast nodes
import jsy.lab3.ast._

// Imports all of the functions form jsy.student.Lab2 (your implementations in Lab2.scala)
import jsy.student.Lab3._
import jsy.lab3.Lab3Like

def step(e: Expr): Expr = {
    e match {
        case N(n) => N(n)

        // DoDiv
        case Binary(Div, N(n1), N(n2)) if (n2 != 0) => {
            val np = n1 / n2
            N(np)
      }

      // DoDiv2
      case Binary(Div, _, N(n2)) if (n2 == 0) => {
            Undefined
      }

      // SearchDiv
      case Binary(Div, e1, N(n2)) if (n2 != 0)=> {
        val e1p = step(e1)
        step(Binary(Div, e1p, N(n2)))
        } 

      // SearchDiv
      case Binary(Div, e1, e2) => {
        val e2p = step(e2)
        step(Binary(Div, e1, e2p))
      }
    }

}