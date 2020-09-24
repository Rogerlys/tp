package seedu.address.model;

import static java.util.Objects.requireNonNull;

import java.util.List;

import javafx.collections.ObservableList;
import seedu.address.model.person.Bug;
import seedu.address.model.person.UniquePersonList;

/**
 * Wraps all data at the address-book level
 * Duplicates are not allowed (by .isSamePerson comparison)
 */
public class AddressBook implements ReadOnlyAddressBook {

    private final UniquePersonList persons;

    /*
     * The 'unusual' code block below is a non-static initialization block, sometimes used to avoid duplication
     * between constructors. See https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
     *
     * Note that non-static init blocks are not recommended to use. There are other ways to avoid duplication
     *   among constructors.
     */
    {
        persons = new UniquePersonList();
    }

    public AddressBook() {}

    /**
     * Creates an AddressBook using the Persons in the {@code toBeCopied}
     */
    public AddressBook(ReadOnlyAddressBook toBeCopied) {
        this();
        resetData(toBeCopied);
    }

    //// list overwrite operations

    /**
     * Replaces the contents of the bug list with {@code bugs}.
     * {@code bugs} must not contain duplicate bugs.
     */
    public void setPersons(List<Bug> bugs) {
        this.persons.setPersons(bugs);
    }

    /**
     * Resets the existing data of this {@code AddressBook} with {@code newData}.
     */
    public void resetData(ReadOnlyAddressBook newData) {
        requireNonNull(newData);

        setPersons(newData.getPersonList());
    }

    //// bug-level operations

    /**
     * Returns true if a bug with the same identity as {@code bug} exists in the address book.
     */
    public boolean hasPerson(Bug bug) {
        requireNonNull(bug);
        return persons.contains(bug);
    }

    /**
     * Adds a bug to the address book.
     * The bug must not already exist in the address book.
     */
    public void addPerson(Bug p) {
        persons.add(p);
    }

    /**
     * Replaces the given bug {@code target} in the list with {@code editedBug}.
     * {@code target} must exist in the address book.
     * The bug identity of {@code editedBug} must not be the same as another existing bug in the address book.
     */
    public void setPerson(Bug target, Bug editedBug) {
        requireNonNull(editedBug);

        persons.setPerson(target, editedBug);
    }

    /**
     * Removes {@code key} from this {@code AddressBook}.
     * {@code key} must exist in the address book.
     */
    public void removePerson(Bug key) {
        persons.remove(key);
    }

    //// util methods

    @Override
    public String toString() {
        return persons.asUnmodifiableObservableList().size() + " persons";
        // TODO: refine later
    }

    @Override
    public ObservableList<Bug> getPersonList() {
        return persons.asUnmodifiableObservableList();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddressBook // instanceof handles nulls
                && persons.equals(((AddressBook) other).persons));
    }

    @Override
    public int hashCode() {
        return persons.hashCode();
    }
}
