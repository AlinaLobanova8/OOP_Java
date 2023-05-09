from abc import ABC, abstractmethod


class Operation(ABC):
    @abstractmethod
    def summa(self):
        pass

    @abstractmethod
    def difference(self):
        pass

    @abstractmethod
    def multiply(self):
        pass

    @abstractmethod
    def devide(self):
        pass