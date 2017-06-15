package aws.kotlin.sts

import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder

object AssumeRoleWithWebIdentity {
    @JvmStatic fun main(args: Array<String>) {
       println("Assume  rolewith Web Identity sample")
       val iam = AmazonIdentityManagementClientBuilder.defaultClient();

        //TODO
    }
}