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

# hasCode e equals
- op classe Object
- equals: lento, resposta 100%
- hasCode: rapido, resposta positiva não é 100%

## hasCode
- retorna numero inteiro representado um codigo gerado a partir das informações do objeto
- um objeto com mesmo valor teria que gerar um mesmo hashCode
  - mas como numero inteiro tem um limite pode acontecer de dois objetos serem verdadeiros e mesmo assim serem diferentes
- Muito rapido, usado em listas grandes para comparar objetos
  - caso seja igual, confirmar novamente com equals

# Set<T>
- representa um conjunto de elementos
- el não possui posições
- podem possuir ordem
- não admite repetições
- acesso, inserção e remoção de elementos são rapidos
- oferece eficientes de conjunto: interseção, união e diferença
- É uma interface e suas principais implementações são:
  - hashSet - mais rapido (operações O(1) em tabela hash) e **não garante a ordem**
  - TreeSet - mais rapido (operações O(log(n)) em arvores rubro-negra) e ordenado pelo compareTo do objeto (Ou Comparator)
    - Quanod usar implementar **compareTo**
  - LinkedHashSet - velocidade intermediaria e elementos ficam na ordem que foram implementados
- metodos importantes
  - add(obj), remove(obj), container(obj)
    - baseado em equals e hashCode
    - se equals e hashCode não existir, é usada comparação de ponteiros
  - clear()
  - size()
  - removeIf(predicate)
# Dicas gerais
- list.compareTo
  - Compara se o primeiro é maior que segundo (do parametro)
  - return 0 se for igual item
  - return 1 se for maior
  - return -1 se for menor


