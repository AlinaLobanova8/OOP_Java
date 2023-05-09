from Operation import Operation


class Calculator(Operation):
    def __init__(self, first_number, second_number, symbol):
        self._first_number = first_number
        self._second_number = second_number
        self._symbol = symbol

    def summa(self):
        return self._first_number + self._second_number

    def difference(self):
        return self._first_number - self._second_number

    def multiply(self):
        return self._first_number * self._second_number

    def devide(self):
        if self._second_number != 0:
            return self._first_number / self._second_number
        else:
            print("Error!")