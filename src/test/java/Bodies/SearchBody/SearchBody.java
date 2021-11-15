package Bodies.SearchBody;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"canReplaceSpellCheckerQuery", "language", "query", "scope", "entities"})
public class SearchBody {
    private Boolean canReplaceSpellCheckerQuery;
    private String language;
    private String query;
    private String scope;
    private String entities;


    public SearchBody(Boolean canReplaceSpellCheckerQuery, String language, String query, String scope, String entities){
        this.canReplaceSpellCheckerQuery = canReplaceSpellCheckerQuery;//false
        this.language = language;//"fa"
        this.query = query;//"query"
        this.scope = scope;//"app"
        this.entities = entities;//""
    }

    public SearchBody(String query, String language, String scope){
        this(false, language, query, scope, "");
    }

    public Boolean getCanReplaceSpellCheckerQuery() {
        return canReplaceSpellCheckerQuery;
    }

    public void setCanReplaceSpellCheckerQuery(Boolean canReplaceSpellCheckerQuery) {
        this.canReplaceSpellCheckerQuery = canReplaceSpellCheckerQuery;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getEntities() {
        return entities;
    }

    public void setEntities(String entities) {
        this.entities = entities;
    }
}
