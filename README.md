# Generics
- Parametrizar classes, interfaces e metodos
- Ex:
```java
List<String> list = new Array<>()
```
- garante type safety e maior performace no lugar de colocar os parametros como Object
- Metodo com geric
- Comparable<T> -> tipo comparavel T
- Comparable<? super T> -> tipo comparavel T ou super T (acima de T)
```java

public static <T extends Comparable<? super T>> T max(List<T> list) {
  if (list.isEmpty()) {
    throw new IllegalStateException("List can't be empty");
  }
  T max = list.get(0);
  for (T item: list) {
    if (item.compareTo(max) > 0) {
      max = item;
    }
  }
  return max;
}  
```
# Dicas gerais
- list.compareTo
  - Compara se o primeiro é maior que segundo (do parametro)
  - return 0 se for igual item
  - return 1 se for maior
  - return -1 se for menor


