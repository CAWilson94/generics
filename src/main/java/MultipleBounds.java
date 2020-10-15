/**
 * Multiple bounds ... a parameter can have multiple bounds
 * e.g. <T extends B1 & B2 & B3>
 * A type variable with multiple bounds is a subtype of all the types listed in the bound.
 * if one of the bounds is a class, it must be specified first.
 * .e.g
 * Class A { }
 * interface B{ }
 * interface C{ }
 * class D <T extends A & B & C>{ }
 *
 */
public class MultipleBounds {
}
