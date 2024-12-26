# Scala ListBuffer toList Unexpected Mutability

This example demonstrates a potential pitfall when converting a Scala `ListBuffer` to an immutable `List` using the `toList` method.  The conversion does not create a deep copy; modifications to the original `ListBuffer` after the conversion can affect the resulting `List`, leading to unexpected behavior.

## Problem
The code incorrectly assumes that converting a `ListBuffer` to a `List` creates a completely independent, immutable copy.  However, the `toList` method creates a *shallow* copy. Changes to the underlying data structure of the `ListBuffer` can still affect the `List`.

## Solution
To create a truly independent immutable copy, explicitly create a new list using the original ListBuffer's elements:  `List(buffer:_*)`