from Calculator import Calculator


class ChoseOperation(Calculator):
    def __init__(self, first_number, second_number, symbol):
        self._first_number = first_number
        self._second_number = second_number
        self._symbol = symbol

    def operation(self,symbol):
        match symbol:
            case "+":
                return self.summa()
            case "-":
                return  self.difference()
            case "*":
               return self.multiply()

            case "/":
                return self.devide()
            case _:
                print("Invalid operator")