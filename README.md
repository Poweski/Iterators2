# Iterators2
Second assignment for algorithms and data structures exercises.

1. Zaimplementuj iterator, który przyjmie inny iterator jako bazowy i zwróci każdy k-ty element
z kolekcji.

2. Zaimplementuj jako iterator generator liczb Fibbonaciego (dwie pierwsze liczby to 1 i 1, każda
kolejna liczba jest sumą dwóch poprzednich): 1, 1, 2, 3, 5, 8, 11 itd.

3. Zaimplementuj iterator, który pobiera dwa inne iteratory i przetasuj kolekcje danych
wejściowych (używając jego iteratorów). M.in. jeśli w pierwszej kolekcji są kolejno liczby 1, 2,
3, 4, 5 a w drugim ciąg 11, 12, 13, to tworzony iterator uzyska dostęp do elementu w
kolejności 1, 11, 2, 12, 3, 13, 4 , 5.

4. Zdefiniuj iterator udostępniający kolejne liczby pierwsze mniejsze od podanego N. Uwaga :
liczby należy generować na bieżąco, nie należy używać tablicy do ich przechowywania
(zamiast tego można tworzyć kolejne iteratory odpowiednio połączone).

5. W iteratorze dla tablicy, zaprezentowanym na wykładzie, nie ma implementacji operacji
remove(). Zaproponuj jej implementację i przedyskutuj rozwiązanie dla przypadku, gdy
dwa iteratory stworzymy dla tej samej tablicy.
