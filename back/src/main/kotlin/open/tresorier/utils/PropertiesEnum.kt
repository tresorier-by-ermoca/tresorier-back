package open.tresorier.utils

enum class PropertiesEnum {
    SERVER_PORT,

    TEST_DB_URL,

    DB_URL,
    DB_USR,
    DB_PWD,

    ALLOWED_ORIGIN_LOCALHOST,
    ALLOWED_ORIGIN_FRONT,
    ALLOWED_ORIGIN_BETA_FRONT,
    ALLOWED_ORIGIN_STRIPE,
    
    ENVIRONMENT,

    STRIPE_API_KEY,
    STRIPE_WEBHOOK,
    
    MONTHLY_INTEGRAL,
    ANNUAL_INTEGRAL,
    MONTHLY_ESSENTIAL,
    ANNUAL_ESSENTIAL,
    MONTHLY_COMPANY,
    ANNUAL_COMPANY,

    TAX_ID,
    SUCCES_URL,
    CANCEL_URL,

    AWEBER_LIST_ID,
    AWEBER_ACCOUNT_ID,
    AWEBER_ACCESS_TOKEN,
    AWEBER_REFRESH_TOKEN,
    AWEBER_CLIENT_ID,

    NORDIGEN_SECRET_ID,
    NORDIGEN_SECRET_KEY,
    NORDIGEN_SUCCESS_URL,

    KEYCLOAK_PUBLIC_KEY,

    API_BASE_URL,
    REDIRECT_URI,
    FRONT_URL,
}