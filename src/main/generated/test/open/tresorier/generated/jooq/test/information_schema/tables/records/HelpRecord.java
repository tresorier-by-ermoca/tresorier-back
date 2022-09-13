/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.Help;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HelpRecord extends TableRecordImpl<HelpRecord> implements Record5<Integer, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.ID</code>.
     */
    public HelpRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
     */
    public HelpRecord setSection(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.SECTION</code>.
     */
    public String getSection() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
     */
    public HelpRecord setTopic(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.TOPIC</code>.
     */
    public String getTopic() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
     */
    public HelpRecord setSyntax(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.SYNTAX</code>.
     */
    public String getSyntax() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
     */
    public HelpRecord setText(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.HELP.TEXT</code>.
     */
    public String getText() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Integer, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Integer, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Help.HELP.ID;
    }

    @Override
    public Field<String> field2() {
        return Help.HELP.SECTION;
    }

    @Override
    public Field<String> field3() {
        return Help.HELP.TOPIC;
    }

    @Override
    public Field<String> field4() {
        return Help.HELP.SYNTAX;
    }

    @Override
    public Field<String> field5() {
        return Help.HELP.TEXT;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getSection();
    }

    @Override
    public String component3() {
        return getTopic();
    }

    @Override
    public String component4() {
        return getSyntax();
    }

    @Override
    public String component5() {
        return getText();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getSection();
    }

    @Override
    public String value3() {
        return getTopic();
    }

    @Override
    public String value4() {
        return getSyntax();
    }

    @Override
    public String value5() {
        return getText();
    }

    @Override
    public HelpRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public HelpRecord value2(String value) {
        setSection(value);
        return this;
    }

    @Override
    public HelpRecord value3(String value) {
        setTopic(value);
        return this;
    }

    @Override
    public HelpRecord value4(String value) {
        setSyntax(value);
        return this;
    }

    @Override
    public HelpRecord value5(String value) {
        setText(value);
        return this;
    }

    @Override
    public HelpRecord values(Integer value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HelpRecord
     */
    public HelpRecord() {
        super(Help.HELP);
    }

    /**
     * Create a detached, initialised HelpRecord
     */
    public HelpRecord(Integer id, String section, String topic, String syntax, String text) {
        super(Help.HELP);

        setId(id);
        setSection(section);
        setTopic(topic);
        setSyntax(syntax);
        setText(text);
    }

    /**
     * Create a detached, initialised HelpRecord
     */
    public HelpRecord(open.tresorier.generated.jooq.test.information_schema.tables.pojos.Help value) {
        super(Help.HELP);

        if (value != null) {
            setId(value.getId());
            setSection(value.getSection());
            setTopic(value.getTopic());
            setSyntax(value.getSyntax());
            setText(value.getText());
        }
    }
}
