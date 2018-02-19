
package helloworld.adarsh.com.jobsearch.retrofitResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PsychoTestResponse {

    private String answer = "";

    private boolean isAnswered;

    private boolean isSelectable;

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("calibratedBehaviour")
    @Expose
    private String calibratedBehaviour;
    @SerializedName("question")
    @Expose
    private String question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalibratedBehaviour() {
        return calibratedBehaviour;
    }

    public void setCalibratedBehaviour(String calibratedBehaviour) {
        this.calibratedBehaviour = calibratedBehaviour;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isSelectable() {
        return isSelectable;
    }

    public void setSelectable(boolean selectable) {
        isSelectable = selectable;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    /*    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("calibratedBehaviour", calibratedBehaviour).append("question", question).toString();
    }
*/
}
