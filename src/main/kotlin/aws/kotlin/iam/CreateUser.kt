/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package aws.example.iam

import com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder
import com.amazonaws.services.identitymanagement.model.CreateUserRequest

/**
 * Creates an IAM user
 */
object CreateUser {

    @JvmStatic fun main(args: Array<String>) {

        val USAGE = "To run this example, supply a username\n" + "Ex: CreateUser <username>\n"

        if (args.size != 1) {
            println(USAGE)
            System.exit(1)
        }

        val username = args[0]

        val iam = AmazonIdentityManagementClientBuilder.defaultClient()

        val request = CreateUserRequest()
                .withUserName(username)

        val response = iam.createUser(request)

        println("Successfully created user: " + response.getUser().getUserName())
    }
}
