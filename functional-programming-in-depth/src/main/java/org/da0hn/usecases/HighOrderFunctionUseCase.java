package org.da0hn.usecases;

import org.da0hn.usecases.lambdas.IConfigurator;
import org.da0hn.usecases.lambdas.IFactory;
import org.da0hn.usecases.lambdas.IProducer;

/**
 * @author daohn
 * @since 19/06/2021
 */
public class HighOrderFunctionUseCase {

  public static void main(String[] args) {
    var factory = createFactory(
      () -> Math.random() * 100,
      Double::intValue
    );

    var product = factory.create();

    System.out.println(product);
  }

  public static <T, R> IFactory<R> createFactory(IProducer<T> producer, IConfigurator<T, R> configurator) {
    return () -> {
      var product = producer.produce();
      return configurator.configure(product);
    };
  }

}
