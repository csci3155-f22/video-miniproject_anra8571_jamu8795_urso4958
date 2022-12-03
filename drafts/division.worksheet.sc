// TODO: get classes working right
def eval(e: Expr): Int = e match {
    // if just a number, no operations necessary
    case N(n) => N

    case Binary(uop, e1, e2) => uop match {
        // according to the grammar, the subexpressions may be sums or differences
        case Plus => eval(e1) + eval(e2)
        case Minus => eval(e1) - eval(e2)

        case Div => 
            // evaluate n2 first, always
            val n2 = eval(e2)
            // SearchDiv: If n2 is not zero, then start evaluating e1
            if (n2 != 0) eval(e1)/n2
            // If n2 is zero, return Undefined
            else Undefined
    }
}