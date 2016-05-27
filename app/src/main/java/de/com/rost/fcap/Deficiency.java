package de.com.rost.fcap;

import android.content.res.Resources;

import java.util.Date;

import de.com.rost.fcap.R;

/**
 * Created by daniel on 27.12.2015.
 */

public class Deficiency {

    private int id;
    private String description, descriptionNotes;
    private Date observationDate, deadline;
    private boolean considerable;

    public Deficiency(String description, Date observationDate, Date deadline, boolean considerable){
        this.id = System.identityHashCode(this);
        setDescription(description);
        setDescriptionNotes(Resources.getSystem().getString(R.string.default_description_notes));
        setObservationDate(observationDate);
        setDeadline(this.deadline = deadline);
        setConsiderable(this.considerable = considerable);
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionNotes() {
        return descriptionNotes;
    }

    public void setDescriptionNotes(String descriptionNotes) {
        this.descriptionNotes = descriptionNotes;
    }

    public Date getObservationDate() {
        return observationDate;
    }

    public void setObservationDate(Date observationDate) {
        this.observationDate = observationDate;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isConsiderable() {
        return considerable;
    }

    public void setConsiderable(boolean considerable) {
        this.considerable = considerable;
    }

}
