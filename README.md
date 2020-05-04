# jpademo

1. [JPA Entity Object Life Cycle - New,Managed,Removed and Detached](https://www.javaguides.net/2019/01/jpa-entity-object-life-cycle-new-managed-removed-detached.html)

2. `OpenEntityManagerInViewInterceptor`

- preHandle(WebRequest request)

- afterCompletion(WebRequest request, @Nullable Exception ex)

3. `JpaTransactionManager`

- doBegin(Object transaction, TransactionDefinition definition)

- doCommit(DefaultTransactionStatus status)

- doRollback(DefaultTransactionStatus status)

- doCleanupAfterCompletion(Object transaction)
