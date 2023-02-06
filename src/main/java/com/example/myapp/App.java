package com.example.myapp;

import java.io.IOException;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.s3.model.CreateBucketConfiguration;
import software.amazon.awssdk.services.s3.model.CreateBucketRequest;
import software.amazon.awssdk.services.s3.model.DeleteBucketRequest;
import software.amazon.awssdk.services.s3.model.DeleteObjectRequest;
import software.amazon.awssdk.services.s3.model.HeadBucketRequest;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.model.S3Exception;
import software.amazon.awssdk.services.s3.S3Client;



import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsSessionCredentials;
import software.amazon.awssdk.auth.credentials.InstanceProfileCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.core.document.Document;
import software.amazon.awssdk.http.SdkHttpClient;
import software.amazon.awssdk.services.identitystore.IdentitystoreClient;
import software.amazon.awssdk.services.identitystore.model.AttributeOperation;
import software.amazon.awssdk.services.identitystore.model.UpdateGroupRequest;
import software.amazon.awssdk.services.identitystore.model.DescribeUserRequest;
import software.amazon.awssdk.services.identitystore.model.DescribeUserResponse;
import software.amazon.awssdk.services.identitystore.model.ListUsersRequest;
import software.amazon.awssdk.services.identitystore.model.ListUsersResponse;
import software.amazon.awssdk.services.identitystore.model.*;


public class App {

    public static void main(String[] args) throws IOException {

        /* 
        Region region = Region.US_WEST_2;
        S3Client s3 = S3Client.builder().region(region).build();

        String bucket = "bucket" + System.currentTimeMillis();
        String key = "key";

        tutorialSetup(s3, bucket, region);

        System.out.println("Uploading object...");

        s3.putObject(PutObjectRequest.builder().bucket(bucket).key(key)
                        .build(),
                RequestBody.fromString("Testing with the AWS SDK for Java"));

        System.out.println("Upload complete");
        System.out.printf("%n");

        cleanUp(s3, bucket, key);
*/

        IdentitystoreClient awsSSOClient =  IdentitystoreClient.builder().build();

        System.out.println("ssoclient--->"+awsSSOClient.toString());
        System.out.println("servciename---->"+awsSSOClient.serviceName());
        System.out.println("got awssso client");
        System.out.println("ssoclient--->"+awsSSOClient);
        ListUsersRequest listUsersRequest = ListUsersRequest.builder().identityStoreId("d-906772fff3").build();
        ListUsersResponse listUsersResponse = awsSSOClient.listUsers(listUsersRequest);
        System.out.println("has users---->"+listUsersResponse.hasUsers());

        for(User user: listUsersResponse.users()) {
            System.out.println("User EID---->"+ user.userName());
        }



        /* 
        System.out.println("Closing the connection to Amazon S3");
        s3.close();
        System.out.println("Connection closed");
        System.out.println("Exiting...");


*/
    }

    public static void tutorialSetup(S3Client s3Client, String bucketName, Region region) {
        try {
            s3Client.createBucket(CreateBucketRequest
                    .builder()
                    .bucket(bucketName)
                    .createBucketConfiguration(
                            CreateBucketConfiguration.builder()
                                    .locationConstraint(region.id())
                                    .build())
                    .build());
            System.out.println("Creating bucket: " + bucketName);
            s3Client.waiter().waitUntilBucketExists(HeadBucketRequest.builder()
                    .bucket(bucketName)
                    .build());
            System.out.println(bucketName +" is ready.");
            System.out.printf("%n");
        } catch (S3Exception e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            System.exit(1);
        }
    }

    public static void cleanUp(S3Client s3Client, String bucketName, String keyName) {
        System.out.println("Cleaning up...");
        try {
            System.out.println("Deleting object: " + keyName);
            DeleteObjectRequest deleteObjectRequest = DeleteObjectRequest.builder().bucket(bucketName).key(keyName).build();
            s3Client.deleteObject(deleteObjectRequest);
            System.out.println(keyName +" has been deleted.");
            System.out.println("Deleting bucket: " + bucketName);
            DeleteBucketRequest deleteBucketRequest = DeleteBucketRequest.builder().bucket(bucketName).build();
            s3Client.deleteBucket(deleteBucketRequest);
            System.out.println(bucketName +" has been deleted.");
            System.out.printf("%n");
        } catch (S3Exception e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            System.exit(1);
        }
        System.out.println("Cleanup complete");
        System.out.printf("%n");
    }
}