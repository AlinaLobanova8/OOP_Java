from ChoseOperation import ChoseOperation


while True:
    number_1 = int(input("Input the first number: "))
    symbol = input("Input operation sign: ")
    number_2 = int(input("Input the second number: "))

    calc = ChoseOperation(number_1,number_2, symbol)
    print(calc.operation(symbol))
    print("Do you want continue? Say YES or NO:")
    answer = input()
    if answer == "NO":
        break