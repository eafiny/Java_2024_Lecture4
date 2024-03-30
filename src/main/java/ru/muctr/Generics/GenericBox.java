package ru.muctr.Generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Evgenia Skichko
 */

@Getter
@Setter
@AllArgsConstructor
public class GenericBox<T extends Number> {
    private T obj;
}
