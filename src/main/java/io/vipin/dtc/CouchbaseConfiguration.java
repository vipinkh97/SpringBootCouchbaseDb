package io.vipin.dtc;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.config.BeanNames;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;
import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.env.CouchbaseEnvironment;
import com.couchbase.client.java.env.DefaultCouchbaseEnvironment;

@Configuration
@EnableCouchbaseRepositories(basePackages = {"io.vipin.dtc"})
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {

	 @Override
	    protected List<String> getBootstrapHosts() {
	        return Arrays.asList("xlenceprogram1.fyre.ibm.com");
	    }
	 
	    @Override
	    protected String getBucketName() {
	        return "test";
	    }
	 
	    @Override
	    protected String getBucketPassword() {
	        return "password";
	    }

  @Override
  public CouchbaseEnvironment getEnvironment() {
    // Set connect Timeout 20000ms = 20s
    CouchbaseEnvironment env = DefaultCouchbaseEnvironment.builder().connectTimeout(20000).build();
    return env;
  }

}