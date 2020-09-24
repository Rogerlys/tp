package seedu.address.model;

import java.nio.file.Path;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.address.commons.core.GuiSettings;
import seedu.address.model.person.Bug;

/**
 * The API of the Model component.
 */
public interface Model {
    /** {@code Predicate} that always evaluate to true */
    Predicate<Bug> PREDICATE_SHOW_ALL_PERSONS = unused -> true;

    /**
     * Replaces user prefs data with the data in {@code userPrefs}.
     */
    void setUserPrefs(ReadOnlyUserPrefs userPrefs);

    /**
     * Returns the user prefs.
     */
    ReadOnlyUserPrefs getUserPrefs();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Sets the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    /**
     * Returns the user prefs' address book file path.
     */
    Path getAddressBookFilePath();

    /**
     * Sets the user prefs' address book file path.
     */
    void setAddressBookFilePath(Path addressBookFilePath);

    /**
     * Replaces address book data with the data in {@code addressBook}.
     */
    void setAddressBook(ReadOnlyAddressBook addressBook);

    /** Returns the AddressBook */
    ReadOnlyAddressBook getAddressBook();

    /**
     * Returns true if a bug with the same identity as {@code bug} exists in the address book.
     */
    boolean hasPerson(Bug bug);

    /**
     * Deletes the given bug.
     * The bug must exist in the address book.
     */
    void deletePerson(Bug target);

    /**
     * Adds the given bug.
     * {@code bug} must not already exist in the address book.
     */
    void addPerson(Bug bug);

    /**
     * Replaces the given bug {@code target} with {@code editedBug}.
     * {@code target} must exist in the address book.
     * The bug identity of {@code editedBug} must not be the same as another existing bug in the address book.
     */
    void setPerson(Bug target, Bug editedBug);

    /** Returns an unmodifiable view of the filtered bug list */
    ObservableList<Bug> getFilteredPersonList();

    /**
     * Updates the filter of the filtered bug list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredPersonList(Predicate<Bug> predicate);
}
