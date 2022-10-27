/*
 * Cromwell Server REST API
 * Describes the REST API provided by a Cromwell server
 *
 * The version of the OpenAPI document: 30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package cromwell.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import cromwell.client.model.CallMetadata;
import cromwell.client.model.FailureMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import cromwell.client.JSON;

/**
 * Workflow and call level metadata
 */
@ApiModel(description = "Workflow and call level metadata")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T17:28:18.362480Z[Etc/UTC]")
public class WorkflowMetadataResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_SUBMISSION = "submission";
  @SerializedName(SERIALIZED_NAME_SUBMISSION)
  private OffsetDateTime submission;

  public static final String SERIALIZED_NAME_START = "start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public static final String SERIALIZED_NAME_END = "end";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private Object inputs;

  public static final String SERIALIZED_NAME_OUTPUTS = "outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private Object outputs;

  public static final String SERIALIZED_NAME_CALLS = "calls";
  @SerializedName(SERIALIZED_NAME_CALLS)
  private CallMetadata calls;

  public static final String SERIALIZED_NAME_FAILURES = "failures";
  @SerializedName(SERIALIZED_NAME_FAILURES)
  private List<FailureMessage> failures = null;

  public WorkflowMetadataResponse() {
  }

  public WorkflowMetadataResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The identifier of the workflow
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the workflow")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public WorkflowMetadataResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the workflow
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the workflow")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public WorkflowMetadataResponse submission(OffsetDateTime submission) {
    
    this.submission = submission;
    return this;
  }

   /**
   * Submission datetime of the workflow in ISO8601 format with milliseconds
   * @return submission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Submission datetime of the workflow in ISO8601 format with milliseconds")

  public OffsetDateTime getSubmission() {
    return submission;
  }


  public void setSubmission(OffsetDateTime submission) {
    this.submission = submission;
  }


  public WorkflowMetadataResponse start(OffsetDateTime start) {
    
    this.start = start;
    return this;
  }

   /**
   * Start datetime of the workflow in ISO8601 format with milliseconds
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start datetime of the workflow in ISO8601 format with milliseconds")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
    this.start = start;
  }


  public WorkflowMetadataResponse end(OffsetDateTime end) {
    
    this.end = end;
    return this;
  }

   /**
   * End datetime of the workflow in ISO8601 format with milliseconds
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End datetime of the workflow in ISO8601 format with milliseconds")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public WorkflowMetadataResponse inputs(Object inputs) {
    
    this.inputs = inputs;
    return this;
  }

   /**
   * Map of input keys to input values
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Map of input keys to input values")

  public Object getInputs() {
    return inputs;
  }


  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }


  public WorkflowMetadataResponse outputs(Object outputs) {
    
    this.outputs = outputs;
    return this;
  }

   /**
   * Map of output keys to output values
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Map of output keys to output values")

  public Object getOutputs() {
    return outputs;
  }


  public void setOutputs(Object outputs) {
    this.outputs = outputs;
  }


  public WorkflowMetadataResponse calls(CallMetadata calls) {
    
    this.calls = calls;
    return this;
  }

   /**
   * Get calls
   * @return calls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CallMetadata getCalls() {
    return calls;
  }


  public void setCalls(CallMetadata calls) {
    this.calls = calls;
  }


  public WorkflowMetadataResponse failures(List<FailureMessage> failures) {
    
    this.failures = failures;
    return this;
  }

  public WorkflowMetadataResponse addFailuresItem(FailureMessage failuresItem) {
    if (this.failures == null) {
      this.failures = new ArrayList<>();
    }
    this.failures.add(failuresItem);
    return this;
  }

   /**
   * Get failures
   * @return failures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FailureMessage> getFailures() {
    return failures;
  }


  public void setFailures(List<FailureMessage> failures) {
    this.failures = failures;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public WorkflowMetadataResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowMetadataResponse workflowMetadataResponse = (WorkflowMetadataResponse) o;
    return Objects.equals(this.id, workflowMetadataResponse.id) &&
        Objects.equals(this.status, workflowMetadataResponse.status) &&
        Objects.equals(this.submission, workflowMetadataResponse.submission) &&
        Objects.equals(this.start, workflowMetadataResponse.start) &&
        Objects.equals(this.end, workflowMetadataResponse.end) &&
        Objects.equals(this.inputs, workflowMetadataResponse.inputs) &&
        Objects.equals(this.outputs, workflowMetadataResponse.outputs) &&
        Objects.equals(this.calls, workflowMetadataResponse.calls) &&
        Objects.equals(this.failures, workflowMetadataResponse.failures)&&
        Objects.equals(this.additionalProperties, workflowMetadataResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, submission, start, end, inputs, outputs, calls, failures, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowMetadataResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
    sb.append("    failures: ").append(toIndentedString(failures)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("submission");
    openapiFields.add("start");
    openapiFields.add("end");
    openapiFields.add("inputs");
    openapiFields.add("outputs");
    openapiFields.add("calls");
    openapiFields.add("failures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowMetadataResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowMetadataResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowMetadataResponse is not found in the empty JSON string", WorkflowMetadataResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field `calls`
      if (jsonObj.get("calls") != null && !jsonObj.get("calls").isJsonNull()) {
        CallMetadata.validateJsonObject(jsonObj.getAsJsonObject("calls"));
      }
      JsonArray jsonArrayfailures = jsonObj.getAsJsonArray("failures");
      if (jsonArrayfailures != null) {
        // ensure the json data is an array
        if (!jsonObj.get("failures").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `failures` to be an array in the JSON string but got `%s`", jsonObj.get("failures").toString()));
        }

        // validate the optional field `failures` (array)
        for (int i = 0; i < jsonArrayfailures.size(); i++) {
          FailureMessage.validateJsonObject(jsonArrayfailures.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowMetadataResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowMetadataResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowMetadataResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowMetadataResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowMetadataResponse>() {
           @Override
           public void write(JsonWriter out, WorkflowMetadataResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowMetadataResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowMetadataResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowMetadataResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowMetadataResponse
  * @throws IOException if the JSON string is invalid with respect to WorkflowMetadataResponse
  */
  public static WorkflowMetadataResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowMetadataResponse.class);
  }

 /**
  * Convert an instance of WorkflowMetadataResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

