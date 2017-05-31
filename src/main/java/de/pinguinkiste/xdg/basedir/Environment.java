package de.pinguinkiste.xdg.basedir;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.valid4j.Assertive.require;

import java.util.Optional;

/**
 * Thin wrapper class to retrieve environment values.
 *
 * <p>This class is intended as a <em>seam</em> for testing and should be considered an
 * implementation detail. The concept of <em>seams</em> is introduced in the book "Working
 * Effectively with Legacy Code" by Michael Feathers.
 */
class Environment {
  /**
   * Wrapper method around {@link System#getenv(String)}.
   *
   * <p>It can be used by stub during testing.
   *
   * @param name The name of the environment variable.
   * @return An {@link Optional} containing the result of the lookup.
   */
  public Optional<String> valueOf(String name) {
    require(name, is(notNullValue()));
    return Optional.ofNullable(System.getenv(name));
  }
}
