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

## Tipos curingas
- generics são invariantes
- representado por "?"
```java
public static void printList(List<?> list) {
  for (Object obj : list) {
  System.out.println(obj);
}
}
```
- é possivel fazer metodos que recebem um generico de "qualquer tipo" porém não é possível adicionar dados a uma coleção tipo curinga
```java
public static void main(String[] args) {
  List<?> list = new ArrayList<Integer>();
  list.add(3); // erro de compilação
}
```

- delimitar um curinga
  - aceitara qualquer lista que extenda Shape
```java
public static double totalArea(List<? extends Shape> list) {}
```

## Covariância (princio get/put)
- Permite pegar (ler)
- Não Permite alterar, adicionar
```java
List<Integer> intList = new ArrayList<Integer>();
intList.add(10);
intList.add(5);
// aceita todo tipo que extende Number (Int, Double...)
List<? extends Number> list = intList;
Number x = list.get(0);

// não permite adicionar pois não sabe se o tipo adicionado será compativel
list.add(20); // erro de compilacao
```

## Contravariância (principio get/put)
- permite adicionar
- não permite pegar
```java
List<Object> myObjs = new ArrayList<Object>();
myObjs.add("Maria");
myObjs.add("Alex");

// aceita qualqeur classe acima de Number (no caso Object)
List<? super Number> myNums = myObjs;
myNums.add(10); // permite adicionar normalmente
myNums.add(3.14);

// não permite atribuir, pois não sabe qual tipo estara nessa posição
Number x = myNums.get(0); 
```

# Dicas gerais
- list.compareTo
  - Compara se o primeiro é maior que segundo (do parametro)
  - return 0 se for igual item
  - return 1 se for maior
  - return -1 se for menor


