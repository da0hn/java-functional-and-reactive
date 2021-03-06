# Predefined Functional Interfaces

![](../../../resources/img/functional_interfaces_diagram.svg)

|Functional Interface| Function Descriptor|
|--------------------|--------------------|
|`Predicate<T>`      |`T -> boolean`      |
|`Consumer<T>`       |`T -> void`         |
|`Function<T,R>`     |`T -> R`            |
|`Supplier<T>`       |`() -> T`           |
|`UnaryOperator<T>`  |`T -> T`            |
|`BinaryOperator<T>` |`(T,T) -> T`        |
|`BiPredicate<L,R>`  |`(L,R) -> boolean`  |
|`BiConsumer<T,U>`   |`(T,U) -> void`     |
|`BiFunction<T,U,R>` |`(T,U) -> R`        |
