package de.pinguinkiste.xdg.basedir;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.valid4j.Assertive.require;

/**
 * Thin wrapper to retrieve environment values.
 */
public class Environment {
    public Optional<String> valueOf(String name) {
        require(name, is(notNullValue()));
        return Optional.ofNullable(System.getenv(name));
    }
}
