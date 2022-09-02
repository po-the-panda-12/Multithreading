# include <stdio.h>
# include <stdlib.h>
# include <pthread.h>
# include <unistd.h>
pthread_mutex_t a_mutex = PTHREAD_MUTEX_INITIALIZER;
volatile long int a = 0;
void threadOne(void *arg) {
  int i;
  long int localA = 0;
  for (i = 1; i < 500000; i++) {
    localA = localA + i;
  }
  pthread_mutex_lock(&a_mutex);
  a = a + localA;
  pthread_mutex_unlock(&a_mutex);
}

void threadTwo(void *arg) {
  int i;
  long int localA = 0;
  for (i = 500000; i <= 1000000; i++) {
    localA = localA + i;
  }
  pthread_mutex_lock(&a_mutex);
  a = a + localA;
  pthread_mutex_unlock(&a_mutex);
}

int main (int argc, char **argv) {
  pthread_t one, two;
  int i;
  pthread_create(&one, NULL, (void*)&threadOne, NULL);
  pthread_create(&two, NULL, (void*)&threadTwo, NULL);
  pthread_join(one, NULL);
  pthread_join(two, NULL);
  printf("%ld\n", a);
}