//  Copyright (c) Microsoft Corporation.
//  All rights reserved.
//
//  This code is licensed under the MIT License.
//
//  Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files(the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and / or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions :
//
//  The above copyright notice and this permission notice shall be included in
//  all copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
//  THE SOFTWARE.

package com.microsoft.identity.client;

/**
 * This exception class is to inform developers that UI is required for authentication to succeed. If {@link MsalUiRequiredException}
 * is caused by service error, claims could be possibly returned.
 * <p>
 *     Set of error codes that could be returned from this exception:
 *     <li>
 *         <ul>invalid_grant: The refresh token used to redeem access token is invalid, expired, revoked. </ul>
 *         <ul>no_tokens_found: Access token doesn't exist and there is no refresh token can be found to redeem access token. </ul>
 *     </li>
 * </p>
 */

public final class MsalUiRequiredException extends MsalException {
    /**
     * The refresh token used to redeem access token is invalid, expired, revoked.
     */
    public final static String INVALID_GRANT = "invalid_grant";

    /**
     * Access token doesn't exist and there is no refresh token can be found to redeem access token.
     */
    public final static String NO_TOKENS_FOUND = "no_tokens_found";


    MsalUiRequiredException(final String errorCode) {
        super(errorCode);
    }

    MsalUiRequiredException(final String errorCode, final String errorMessage) {
        super(errorCode, errorMessage);
    }

    MsalUiRequiredException(final String errorCode, final String errorMessage, final Throwable throwable) {
        super(errorCode, errorMessage, throwable);
    }
}
